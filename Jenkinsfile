def getDockerTag() {
    def tag = bat script: 'git rev-parse HEAD' , returnStdout:true
    return tag;
}
pipeline {
    agent any

    environment {
        Docker_tag = getDockerTag()
    }

    stages {
    
    	stage("Quality Check") {
            steps {
                script {
                	withSonarQubeEnv('sonar-server') {
                        bat "mvn clean install sonar:sonar"

                    }
                }                
            }
        }

        stage ("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

        stage ("Build") {
            steps {
                script{
                    bat 'docker build . -t dondapatirc/devops-training:Docker_tag'
                    withCredentials([string(credentialsId: 'docker-token', variable: 'docker-token-ref')]) {
                        bat '''docker login -u dondapatirc -p $docker-token_ref
                        docker push dondapatirc/devops-training:Docker_tag
                        '''
                    }
                }
            }
        }
        
    }
}
