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

import java.text.DecimalFormat
import java.util.*

/**
 * Created By Prabhat Pandey for UsefulMethodsAndroid project
 * on Thursday, 28 October, 2021 at 11:15 AM
 */

object StringUtils {

    // This function is not working as expected. We are trying to fix it.
    fun rateDoubleToString(number: Double?): String? {

        return if (number == 0.0) {
            null
        } else {
            number?.let {
                val numberFormatter = DecimalFormat("##,##,##,##,##,##,###")
                numberFormatter.format(it)
            }
        }
    }

    /**
     * Returns Indian format currency string from [amount]
     */
    fun indianCurrencyFromDoubleWithDecimal(amount: Double): String? {
        var s = java.lang.String.format(Locale.UK, "%1.2f", Math.abs(amount))
        s = s.replace("(.+)(...\\...)".toRegex(), "$1,$2")
        while (s.matches(Regex("\\d{3,},.+"))) {
            s = s.replace("(\\d+)(\\d{2},.+)".toRegex(), "$1,$2")
        }
        return if (amount < 0) "-$s" else s
    }


    /**
     * Returns a random Base62 string of given [length]
     */
    fun getRandomBase62String(length: Int): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }

    /**
     * Returns a random Base58 string of given [length]
     * Base58 does not use 0OIl to avoid confusion
     */
    fun getRandomBase58String(length: Int): String {
        val allowedChars = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}