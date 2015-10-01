package net

import com.typesafe.config.ConfigFactory

object Main extends App {
	override def main(args: Array[String]) {
		val baseConfig = ConfigFactory.load()
		val appConfig = baseConfig.getConfig("app")
		val hardCodedConfig = baseConfig.getConfig("hard-coded")
		val merged = appConfig.withFallback(hardCodedConfig)

		val bar   = merged.getString("bar")
		val bippy = merged.getString("bippy")
		println(s"bar: $bar | bippy : $bippy")
	}
}