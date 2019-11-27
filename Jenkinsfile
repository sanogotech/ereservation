pipeline {
    agent any
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
				withMaven(maven : 'M3') {
						bat'mvn clean compile'
				}
            }
        }
        stage('Test') { 
            steps {
                echo 'Hello, Test '
                withMaven(maven : 'M3') {
						bat 'mvn test'
				}

            }
        }
		
		
		 stage('Package') { 
            steps {
                echo 'Hello, Package'
				
				withMaven(maven : 'M3') {
						bat 'mvn package'
				}
            }
        }
    }
}