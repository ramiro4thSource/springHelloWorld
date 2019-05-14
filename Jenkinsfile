pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn package && java -jar target/exerciseDbConnection-1.0-SNAPSHOT.jar'
            }
        }
    }
}