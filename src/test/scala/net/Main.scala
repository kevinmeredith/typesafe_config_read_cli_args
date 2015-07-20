package net

import com.typesafe.config.ConfigFactory

object Main extends App {
	override def main(args: Array[String]) {
		val x = ConfigFactory.load().getString("app.bar")
		println(s"x: $x")
	}
}