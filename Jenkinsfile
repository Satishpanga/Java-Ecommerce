pipeline {
    agent any
    
    environment {
        TOMCAT_URL = "http://3.236.137.45:8080"
        TOMCAT_USER = "deployer"
        TOMCAT_PASS = credentials('tomcat-deployer') // Store in Jenkins Credentials
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', 
                url: 'https://github.com/YOUR-USERNAME/ecommerce-platform.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Deploy to Tomcat') {
            steps {
                sh """
                mvn tomcat7:deploy \
                    -Dmaven.tomcat.url=${TOMCAT_URL} \
                    -Dmaven.tomcat.username=${TOMCAT_USER} \
                    -Dmaven.tomcat.password=${TOMCAT_PASS}
                """
            }
        }
    }
    
    post {
        success {
            slackSend(color: "good", message: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'")
        }
        failure {
            slackSend(color: "danger", message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'")
        }
    }
}
