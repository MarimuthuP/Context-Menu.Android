package com.yalantis.contextmenu.lib.extensions

import com.nineoldandroids.animation.Animator

fun Animator.onAnimationEnd(onAnimationEnd: (Animator?) -> Unit) {
    this.addListener(object : Animator.AnimatorListener {
        override fun onAnimationRepeat(animation: Animator?) {
            // do nothing
        }

        override fun onAnimationEnd(animation: Animator?) {
            onAnimationEnd.invoke(animation)
        }

        override fun onAnimationCancel(animation: Animator?) {
            // do nothing
        }

        override fun onAnimationStart(animation: Animator?) {
            // do nothing
        }
    })
}