import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class playCodeTest {
    @DisplayName("Junit Play Test")
    @Test
    public void testNumber() {

        String fb = playCode.play(1);

        Assertions.assertEquals(fb,"테스트실행합니다1");

        /*
        assertArrayEquals - 두 배열이 똑같은 값을 가진 똑같은 크기의 배열인지 확인
        assertEquals - 두 값이 똑같은 값인지 확인
        assertTrue - 해당 값이 True인지 확인
        assertFalse - 해당 값이 False인지 확인
        assertNull - 해당 값이 Null인지 확인
        assertNotNull - 해당 값이 Null이 아닌지 확인
        assertSame - 두 개체가 같은 개체인지 확인
        assertNotSame - 두 개체가 같은 개체가 아닌지 확인
        fail - 무조건 실패
        assertThat - 해당 개체가 특정 상황을 만족하는지 확인
        */
    }
}