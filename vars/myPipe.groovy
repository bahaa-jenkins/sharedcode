def call( Map settings = [:] ) {
    node('master'){
           stage('build') {
               step { sh 'echo Building ${BRANCH_NAME}...' }
     }
    }
}
