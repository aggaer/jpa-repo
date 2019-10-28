package com.bestore.jparepo.web

import com.bestore.jparepo.entity.Employ
import com.bestore.jparepo.entity.PtActivity
import com.bestore.jparepo.entity.PtCollect
import com.bestore.jparepo.repo.EmployRepo
import com.bestore.jparepo.repo.PtActivityRepo
import com.bestore.jparepo.repo.PtCollectRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant
import javax.annotation.Resource

@RestController
class RestActivity {
    @Resource
    lateinit var ptActivityRepo: PtActivityRepo
    @Resource
    lateinit var ptCollectRepo: PtCollectRepo
    @Resource
    lateinit var employRepo: EmployRepo

    @GetMapping("/save")
    fun saveAll(): String {
        val employ = Employ(null, "李晓晴", 15, "1865047125")
        employRepo.save(employ)
        val ptActivity = PtActivity(null, "普通拼团", "武汉", Instant.now())
        ptActivityRepo.save(ptActivity)
        val ptCollect = PtCollect(null, 123, "区域团", 5)
        ptCollectRepo.save(ptCollect)
        return "fin"
    }
}