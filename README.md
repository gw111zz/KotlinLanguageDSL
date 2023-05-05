This project contains a Kotlin DSL for describing lists of vocabulary to aid language learning.

It allows languages to be defined and lists of vocabulary pairs in those languages.

To define languages:

```
Add language {
  with name "Italian"
  with code "it"
}

Add language {
  with name "English" 
  with code "en"
}
```

To define a list of vocabulary:

```
Add category {
  with name "Adverbs of time"
  with nativeLanguage "English"
  with languageToLearn "Italian"

  with vocabulary {
    "adesso" means "now"
    "subito" means "immediately"
  }
}
```

