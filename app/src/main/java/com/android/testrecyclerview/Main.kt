@file:Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")

package com.android.testrecyclerview

/*Given an integer array nums, return true if any value appears at least twice
 in the array, and return false if every element is distinct: Input: nums = [1,2,3,1] Output: true
 */

fun main1() {
    val nums: IntArray = intArrayOf(1, 2, 3, 4, 1, 9, 3)
    val set = HashSet<Int>()
    for (num in nums) {
        if (!set.add(num)) {
            println("true $num")
        } else {
            println("false $num")
        }
    }
}

/*Получив строку columnTitle, представляющую заголовок столбца, отображаемый на листе Excel,
 вернуть соответствующий номер столбца. Ввод: columnTitle = "A" Вывод: 1 */

fun main2() {
    val columnTitle: String = "ABC"
    var number: Int = 0
    val ln = columnTitle.length - 1

    for (i in 0..ln) {
        number *= 26
        for (j in 'A'..'Z') {
            number++
            if (j == columnTitle.get(i)) break
        }
    }
    println(message = number)
}

/*Вам дан массив, prices где указана prices[i]цена данной акции в день.ith
Вы хотите максимизировать свою прибыль, выбрав один день для покупки одной акции и выбрав другой
день в будущем для продажи этой акции.Верните максимальную прибыль, которую вы можете
 получить от этой сделки . Если вы не можете получить какую-либо прибыль, верните 0.
 Входные данные: цены = [7,1,5,3,6,4]
 Выходные данные: 5
 Объяснение: Покупка во 2-й день (цена = 1) и продажа в 5-й день (цена = 6), прибыль = 6-1 = 5.
Обратите внимание, что покупка во 2-й день и продажа в 1-й день не разрешены, потому что вы должны купить перед продажей.
 */

fun main3() {
    val prices: IntArray = intArrayOf(7, 1, 5, 3, 6, 4)
    var minPrice: Int = Int.MAX_VALUE
    var profit: Int = 0

    for (num in prices) {
        minPrice = minOf(minPrice, num)
        profit = maxOf(profit, num - minPrice)
    }
    println(profit)
}

fun main4() {
    val prices: IntArray = intArrayOf(7, 1, 5, 3, 6, 4)
    var maxProfit: Int = 0
    var profit: Int = 0

    for (i in prices.indices) {

        for (j in i + 1 until prices.size) {
            profit = (prices[j] - prices[i])

            if (profit > maxProfit) {
                maxProfit = profit
            }
        }
    }
    println(maxProfit)
}