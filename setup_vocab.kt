val languages = mutableListOf<Language>()
val categories = mutableListOf<Category>()

class Language {
  var languageName = ""
  var languageCode = ""

  val with = this

  infix fun name(name: String) {
    languageName = name 
  }

  infix fun code(code: String) {
    languageCode = code
  }

  override fun toString(): String =
    "Language(name = $languageName, code = $languageCode)"
}

data class VocabPair(val vocab: String, val translation: String)

class VocabularyListBuilder {
    val vocab = mutableListOf<VocabPair>()

    fun build(): List<VocabPair> = vocab

    infix fun String.means(translation: String) {
        vocab.add(VocabPair(this, translation))
    }
}

class Category(
  var categoryName: String = "", 
  var nativeLanguageName: String = "", 
  var languageToLearnName: String = "",
  var vocabulary: List<VocabPair> = emptyList()
) {

  val with = this

  infix fun name(name: String) {
    categoryName = name
  }

  infix fun nativeLanguage(name: String) {
    nativeLanguageName = name
  }

  infix fun languageToLearn(name: String) {
    languageToLearnName = name
  }

  infix fun vocabulary(block: VocabularyListBuilder.() -> Unit) {
    val builder = VocabularyListBuilder()
    builder.block()
    vocabulary = builder.build()
  }

  override fun toString(): String = "Category(name = $categoryName, nativeLanguage = $nativeLanguageName, languageToLearn = $languageToLearnName, vocabulary = $vocabulary)"
}

object Add {
  infix fun language(block: Language.() -> Unit) =
    languages.add(Language().apply(block))

  infix fun category(block: Category.() -> Unit) =
    categories.add(Category().apply(block))
}



