package cc.unitmesh.untitled.demo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MathHelperTest {
    // 寻找两个正序数组的中位数
    // Given 两个正序数组分别为[1, 3]和[2], When 寻找中位数， Then 中位数为2.0
    // Given 两个正序数组分别为[1, 2]和[3, 4], When 寻找中位数， Then 中位数为2.5
    // Given 两个正序数组分别为[1, 3, 5]和[2, 4, 6], When 寻找中位数， Then 中位数为3.5

    @Test
    // Given 两个正序数组分别为[1, 3]和[2], When 寻找中位数， Then 中位数为2.0
    public void testFindMedianSortedArrays_case1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;

        double result = MathHelper.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, result, 0.001);
    }

    @Test
// Given 两个正序数组分别为[1, 2]和[3, 4], When 寻找中位数， Then 中位数为2.5
    public void testFindMedianSortedArrays_case2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;

        double result = MathHelper.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, result, 0.001);
    }

    @Test
// Given 两个正序数组分别为[1, 3, 5]和[2, 4, 6], When 寻找中位数， Then 中位数为3.5
    public void testFindMedianSortedArrays_case3() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        double expected = 3.5;

        double result = MathHelper.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, result, 0.001);
    }

    // 删除链表的倒数第 N 个结点
    // Given 一个链表为 1->2->3->4->5，N 为 2，When 删除倒数第 2 个结点，Then 链表变为 1->2->3->5 // Given 一个链表为 1->2->3->4->5，N 为 1，When 删除倒数第 1 个结点，Then 链表变为 1->2->3->4 // Given 一个链表为 1，N 为 1，When 删除倒数第 1 个结点，Then 链表变为空链表
}
