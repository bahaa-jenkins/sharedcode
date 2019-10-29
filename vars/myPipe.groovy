
def call(Map settings = [:]) {
    agent any
    stages {
            stage('build') {
                            steps {
                                  sh 'echo Building ${BRANCH_NAME}...'
                                  }
                           }
           }
}
