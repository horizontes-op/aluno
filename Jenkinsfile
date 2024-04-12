pipeline {
    agent any
    stages {
        stage('Jenkins Aluno') {
            steps {
                echo 'Jenkins Aluno'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}