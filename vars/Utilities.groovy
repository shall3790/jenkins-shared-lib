package com.hobbylobby;

class Utilities {
  static def mvn(script, args) {
    script.sh "echo ${script.env.HOME} args: ${args}"
  }
}