//
// Created by mehme on 11.02.2024.
//

#include "../inc/fibonacci.h"
#include <android/log.h>

//fibonacci sequence: {1, 1, 2, 3, 5, 8, 13...}
#define MYTAG "[NDKDemo]:CPP "

jlong fibonacci(jint element)
{
    jlong last = 1;
    jlong prev = 1;
    for(jint i=2; i<element; i++){
        long tmp = last;
        last = last + prev;
        prev = tmp;
    }
    __android_log_print(ANDROID_LOG_DEBUG, MYTAG, "result:%ld", last);
    return last;
}
