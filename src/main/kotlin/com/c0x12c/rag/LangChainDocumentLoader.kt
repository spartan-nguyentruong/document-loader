package com.c0x12c.rag

import dev.langchain4j.data.document.loader.FileSystemDocumentLoader

class LangChainDocumentLoader : DocumentLoader {
    override fun load(url: String): Document {
        // TODO: Load the document using langchain4j
        val langchainDocument = FileSystemDocumentLoader.loadDocument(url)

        return langchainDocument.toDocument()
    }
}