package ru.barinov.service

import mu.KotlinLogging
import java.util.*

/**
 * @author Алексей Евгеньевич Баринов (BarinovAlE)
 * @version 1.0
 *          Date: 14.12.2019
 *          Time: 22:02
 */
class SimpleService {
    companion object {
        private val logger = KotlinLogging.logger {}
    }

    fun readOne(): String {
        logger.info { "readOne operation" }
        return "One record was read"
    }

    fun readList(): List<String> {
        logger.info { "readList operation" }

        return listOf("1", "2", "3")
    }
}