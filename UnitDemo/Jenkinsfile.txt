pipeline{
    agent any
    
    stages{
        
        stage('Compile'){
            steps{
                withAnt(Ant : 'ant')
                bat 'ant compile'
            }
            
        }
        
    }
    
}