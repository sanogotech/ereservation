pipeline {
    agent any
	tools {
        maven 'M3' 
    }
    stages {
	
		stage('SourcePreparation') {
			steps {	
				// Get some code from a GitHub repository
				git 'https://github.com/sanogotech/ereservation.git'
				
				// Get the Maven tool.
				// ** NOTE: This 'M3' Maven tool must be configured
				// **  in the global configuration.  
			}
		}
		
        stage('Build') {
            steps {
                echo 'Hello, Build Maven'
				bat'mvn clean compile'
            }
        }
        stage('Test') { 
            steps {
                echo 'Hello, Test '
				bat 'mvn test'
			}

            }
        }
		
		
		 stage('Package') { 
            steps {
                echo 'Hello, Package'
				bat 'mvn package'
            }
        }
    }
}