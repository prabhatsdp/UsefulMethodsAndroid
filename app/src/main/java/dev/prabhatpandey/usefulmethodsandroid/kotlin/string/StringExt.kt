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

package dev.prabhatpandey.usefulmethodsandroid.kotlin.string

import android.util.Log

/**
 * Created By Prabhat Pandey for UsefulMethodsAndroid project
 * on Thursday, 28 October, 2021 at 11:17 AM
 */

/**
 * Returns the Double value of a valid string and
 * returns ZERO (0.0) if the string cannot be converted to double.
 */
fun String.toDoubleOrZero() : Double{
    return try {
        if (this.isEmpty()) 0.0 else this.toDouble()
    } catch (e: Exception) {
        Log.d("String.toDoubleOrZero", "toDoubleOrZero: ${e.stackTrace}")
        0.0
    }
}

