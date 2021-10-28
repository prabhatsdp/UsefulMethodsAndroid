/*
 * Copyright © Prabhat Pandey (2021)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to
 * do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN
 * AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */


package dev.prabhatpandey.usefulmethodsandroid.android

import android.content.Context
import android.util.TypedValue
import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager


/**
 * Created By Prabhat Pandey for UsefulMethodsAndroid project
 * on Thursday, 28 October, 2021 at 10:56 AM
 */

/**
 * Contains utility methods specific for Android app.
 */
object AppUtils {

    /**
     * Returns the equivalent DP value of the given [px] using [context]
     */
    fun getDpFromPixels(context: Context, px: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, px,
            context.resources.displayMetrics
        ).toInt()
    }

    /**
     * Shows the soft input keyboard in the current [activity]
     */
    fun showKeyboard(activity: Activity, view: View) {
        val imm: InputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(view, 0)
    }

    /**
     * Hides the soft input keyboard from [activity]
     */
    fun hideKeyboard(activity: Activity, view: View) {
        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}