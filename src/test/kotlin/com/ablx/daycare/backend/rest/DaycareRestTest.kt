package com.ablx.daycare.backend.rest

import com.ablx.daycare.backend.entity.Daycare
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import java.nio.charset.Charset


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DaycareRestTest{

    private val contentType = MediaType("application", "json", Charset.forName("UTF-8"))

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate


    @Test
    fun getOneDaycare() {
        val result = testRestTemplate.getForEntity("/daycares/1", Daycare::class.java)
        assertNotNull(result)
        assertEquals( HttpStatus.OK,result.statusCode)
        assertEquals( contentType,result.headers.contentType)
        assertEquals( Daycare(1L,"Ma garderie"),result.body)

    }


}