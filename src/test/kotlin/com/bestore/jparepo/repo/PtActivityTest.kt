package com.bestore.jparepo.repo

import com.bestore.jparepo.entity.Employ
import com.bestore.jparepo.entity.PtActivity
import com.bestore.jparepo.entity.PtCollect
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.time.Instant
import javax.annotation.Resource

@SpringBootTest
class PtActivityTest {
    @Resource
    lateinit var ptActivityRepo: PtActivityRepo
    @Resource
    lateinit var ptCollectRepo: PtCollectRepo
    @Resource
    lateinit var employRepo: EmployRepo

    @Test
    fun testRepo() {
        val employ = Employ(null, "李晓晴", 15, "1865047125")
        employRepo.save(employ)
        val ptActivity = PtActivity(null, "普通拼团", "武汉", Instant.now())
        ptActivityRepo.save(ptActivity)
        val ptCollect = PtCollect(null, 123, "区域团", 5)
        ptCollectRepo.save(ptCollect)
    }
}