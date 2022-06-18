package com.kkllor

import java.util.concurrent.Executor

fun main(args: Array<String>) {
    var a = 1
    val objectWatcher = ObjectWatcher({}, checkRetainedExecutor = Executor {it->
        wrapRunnable(it)
    }, isEnabled = { true })
}

fun wrapRunnable(runnable: Runnable){

}



class ObjectWatcher constructor(
        private val clock: () -> Unit,
        private val checkRetainedExecutor: Executor,
        /**
         * Calls to [watch] will be ignored when [isEnabled] returns false
         */
        private val isEnabled: () -> Boolean = { true }
)