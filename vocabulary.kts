// To run this:
//
// % kotlinc -d setup_vocab.jar setup_vocab.kt
// % kotlinc -classpath setup_vocab.jar -script vocabulary.kts

Add language {
  with name "Italian"
  with code "it"
}

Add language {
  with name "English" 
  with code "en"
}

languages.forEach { println(it) }

Add category {
  with name "Adverbs of time"
  with nativeLanguage "English"
  with languageToLearn "Italian"

  with vocabulary {
    "adesso" means "now"
    "subito" means "immediately"
  }
}

Add category {
  with name "Common Verbs 1"
  with nativeLanguage "English"
  with languageToLearn "Italian"

  with vocabulary {
    "andare" means "to go"
    "stare" means "to stay"
  }
}

categories.forEach { println(it) } 

