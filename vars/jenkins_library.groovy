def call(int build_number) {
    if (build_number%2 == 0) {
        pipeline {
            agent any 
            stages {
                stage('Even') {
                    steps {
                        echo 'Build number is even'
                        script {
                            log.info 'Starting even build'
                            log.warning 'Nothing to do'
                        }
                    }   
                }
            }
        }
    }
    else {
        pipeline {
            agent any
            stages {
                stage ('Odd') {
                    steps {
                        echo 'Build number is odd'
                        script {
                            log.info 'Starting odd build'
                            log.warning 'Nothing to do'
                        }
                    } 
                }
            }
        }
    }
}