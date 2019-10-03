pipeline {
    agent any

    stages {
       stage('Build') {
            parallel {
                stage('JDK11') {
                    steps {
                        sh 'echo build'
                        sh 'JDK=11-jdk COMMIT=${GIT_COMMIT} docker-compose -p 11-jdk-${GIT_COMMIT} build --build-arg JDK="11-jdk"'
                    }
                }
            }
        }

        stage('Test'){
            parallel {
                stage('JDK11') {
                    steps {
                        sh 'echo test'
                        sh 'IS_CI=true JDK=11-jdk JAVA_PROFILE=java11 COMMIT=${GIT_COMMIT} docker-compose -p 11-jdk-${GIT_COMMIT} up --exit-code-from=scope-demo-scala scope-demo-scala'
                    }
                }
            }
        }
    }

    post {
        always {
            sh 'JDK=11-jdk COMMIT=${GIT_COMMIT} docker-compose -p 11-jdk-${GIT_COMMIT} down -v'
        }
    }

}