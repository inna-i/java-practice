package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    private LoopsTask unit = new LoopsTask();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void levelEducationAchievementsInitialLevel(int grade) {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("Initial", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6})
    void levelEducationAchievementsAverageLevel(int grade) {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("Average", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 8, 9})
    void levelEducationAchievementsSufficientLevel(int grade) {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("Sufficient", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 11, 12})
    void levelEducationAchievementsHighLevel(int grade) {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("High", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 12})
    void seasonWinter(int month) {
        String actual = unit.season(month);
        assertEquals("Winter", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5})
    void seasonSpring(int month) {
        String actual = unit.season(month);
        assertEquals("Spring", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 7, 8})
    void seasonSummer(int month) {
        String actual = unit.season(month);
        assertEquals("Summer", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {9, 10, 11})
    void seasonAutumn(int month) {
        String actual = unit.season(month);
        assertEquals("Autumn", actual);
    }

    @Test
    void compactDiscsLessThan20() {
        int actual = unit.compactDiscs(10);
        assertEquals(20, actual);
    }

    @Test
    void compactDiscsForSmallPack() {
        int actual = unit.compactDiscs(20);
        assertEquals(30, actual);
    }

    @Test
    void compactDiscsForMoreThanSmallPack() {
        int actual = unit.compactDiscs(25);
        assertEquals(40, actual);
    }

    @Test
    void compactDiscsTwoSmallPacks() {
        int actual = unit.compactDiscs(40);
        assertEquals(60, actual);
    }

    @Test
    void compactDiscsMoreThanTwoSmallPacks() {
        int actual = unit.compactDiscs(50);
        assertEquals(80, actual);
    }

    @Test
    void compactDiscsBigPack() {
        int actual = unit.compactDiscs(100);
        assertEquals(100, actual);
    }

    @Test
    void compactDiscsMoreThanBigPack() {
        int actual = unit.compactDiscs(102);
        assertEquals(104, actual);
    }

    @Test
    void compactDiscsSmallAndBigPack() {
        int actual = unit.compactDiscs(120);
        assertEquals(130, actual);
    }

    @Test
    void compactDiscsMoreThanSmallAndBigPack() {
        int actual = unit.compactDiscs(125);
        assertEquals(140, actual);
    }

    @Test
    void productOfThreeNumbers() {
        int actual = unit.productOfNums(235);
        assertEquals(30, actual);
    }

    @Test
    void productOfNumsIterative() {
        int actual = unit.productOfNums(333);
        assertEquals(27, actual);
    }

    @Test
    void productOfNumsUsingString() {
        int actual = unit.productOfNumsUsingString(333);
        assertEquals(27, actual);
    }

    @Test
    void getQuarterByCoordinates() {
        int actual = unit.whichQuarter(-2, 3);
        assertEquals(2, actual);
    }

    @Test
    void getQuarterByCoordinatesQuarter2() {
        int actual = unit.whichQuarter(-2, 3);
        assertEquals(2, actual);
    }
}