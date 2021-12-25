def call(String name = 'User') {
 echo "Welcome, ${name}."
}

def testFun(String name = 'User') {
 Map pipelineCfg = readYaml file: "C:/Users/66480/.jenkins/workspace/shared-lib-spec/build.yml"
 echo "Test Welcome, ${name}."
 echo "Test Welcome, ${pipelineCfg}."
}
