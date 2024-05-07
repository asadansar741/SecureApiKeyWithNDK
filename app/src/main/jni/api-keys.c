#include <jni.h>

//For first API key
JNIEXPORT jstring JNICALL Java_com_test_secureapikeywithndk_MainActivity_getAPIKey(JNIEnv *env, jobject instance) {

return (*env)-> NewStringUTF(env, "my-api-key-is-xxx-yyy-zzz");
}