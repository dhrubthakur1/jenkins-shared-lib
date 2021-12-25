import groovy.yaml.YamlSlurper

def call(String name = 'User') {
 echo "Welcome, ${name}."
}

def testFun(String name = 'User') {
 def pipelineCfg = new YamlSlurper().parseText("C:/Users/66480/.jenkins/workspace/shared-lib-spec/build.yml")
 //Map pipelineCfg = readYaml file: "C:/Users/66480/.jenkins/workspace/shared-lib-spec/build.yml"
 echo "Test Welcome, ${name}."
 echo "Test Welcome, ${pipelineCfg}."
}
