#!/usr/bin/env groovy

def call(String name = 'human', Object env) {
  echo "Hello, ${name}. ${env.HOME}"
}