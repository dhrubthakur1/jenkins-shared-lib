def call(String name = 'User') {
 echo "Welcome, ${name}."
}

def testFun(String name = 'User') {
 Map pipelineCfg = readYaml(file: "http://localhost:8080/job/shared-lib-spec/47/execution/node/4/ws/build.yml")
 echo "Test Welcome, ${name}."
 echo "Test Welcome, ${pipelineCfg}."
}
