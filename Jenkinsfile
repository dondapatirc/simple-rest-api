pipeline {
    agent any

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
        stage ("Quality Gate ") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        
    }
}
