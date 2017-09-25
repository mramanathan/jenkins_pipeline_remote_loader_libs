#!/usr/bin/groovy

/*
  pass the echo statement to me
*/

def echome(String message) {
  if ( "${message}" ) {
    println "Message passed to me, " + message
  } else {
    println "No message was passed to me!"
  }
}

return this
