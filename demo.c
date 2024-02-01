#include<stdio.h>
#include"JT.h"
#include"welcome.h"

/*
 * Class:     JT
 * Method:    call
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_JT_call
  (JNIEnv * env, jobject obj) {
  printf("hello, demo!\n");
  welcome1(); //welcome.a
}
