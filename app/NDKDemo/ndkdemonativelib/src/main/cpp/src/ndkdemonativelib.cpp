#include "jni.h"
#include <string>

#include "../inc/fibonacci.h"
/**********************************************************************
*
*/
extern "C" JNIEXPORT jstring JNICALL
Java_com_example_ndkdemonativelib_NDKDemoNativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
/**********************************************************************
*
*/
extern "C"
JNIEXPORT jlong JNICALL
Java_com_example_ndkdemonativelib_NDKDemoNativeLib_fibonacciFromJNI(JNIEnv *env, jobject thiz, jint element ) {
    // TODO: implement fibonacciFromJNI()
    return fibonacci(element);
}
/**********************************************************************
*
*/