package com.bestore.jparepo.repo

import com.bestore.jparepo.entity.Employ
import com.bestore.jparepo.entity.PtActivity
import com.bestore.jparepo.entity.PtCollect
import org.springframework.data.jpa.repository.JpaRepository

interface PtActivityRepo : JpaRepository<PtActivity, Int>

interface PtCollectRepo : JpaRepository<PtCollect, Int>

interface EmployRepo : JpaRepository<Employ, Int>