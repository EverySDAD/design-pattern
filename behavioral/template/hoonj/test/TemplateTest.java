import coffe.Americano;
import coffe.Coffee;
import coffe.GreenTea;
import coffe.Latte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemplateTest {

    ByteArrayOutputStream outputStream;
    PrintStream printStream;

    @BeforeEach
    void setUp(){
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @Test
    @DisplayName("아메리카노 주문 테스트")
    void AmericanoTest(){
        // Given
        Coffee coffee = new Americano();

        // When
        coffee.getCoffee();

        // Then
        assertEquals("에스프레소 2샷 추가\n물 400ml 추가\n",outputStream.toString());
    }

    @Test
    @DisplayName("라때 주문 테스트")
    void LatteTest(){
        // Given
        Coffee coffee = new Latte();

        // When
        coffee.getCoffee();

        // Then
        assertEquals("에스프레소: 1샷\n물: 반잔\n휘핑크림 추가\n",outputStream.toString());
    }

    @Test
    @DisplayName("녹차 주문 테스트")
    void GreenTeaTest(){
        // Given
        Coffee coffee = new GreenTea();

        // When
        coffee.getCoffee();

        // Then
        assertEquals("녹차 티백 추가\n뜨거운 물 한잔 추가\n",outputStream.toString());
    }
}