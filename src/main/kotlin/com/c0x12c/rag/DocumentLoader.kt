package com.c0x12c.rag

interface DocumentLoader {
    fun load(url: String): Document
}