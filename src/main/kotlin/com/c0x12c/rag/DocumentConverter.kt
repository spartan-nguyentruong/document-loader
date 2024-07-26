package com.c0x12c.rag

import dev.langchain4j.data.document.Document as LangchainDocument

fun LangchainDocument.toDocument() = Document(
    text = this.text(),
    metadata = this.metadata().toMap()
)