def call( Map settings = [:] ) {
    node('master'){
           stage('build') {
               sh 'echo Building ${BRANCH_NAME}...'
     }
    }
}
