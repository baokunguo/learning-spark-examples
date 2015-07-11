package Test

import java.util.Date

import akka.actor.Actor

/**
 * Created by root on 15-7-11.
 * Project: ${Project_name}.
 *
 * Just for Matrix.
 */
abstract class AuctionReply {

  case class Status(asked: Int, expire: Date) extends AuctionReply

  case object BestOffer extends AuctionReply

  case class BeatenOffer(maxBid: Int) extends AuctionReply

  case class AuctionConcluded(seller: Actor, client: Actor) extends AuctionReply

  case object AuctionFailed extends AuctionReply

  case object AuctionOver extends AuctionReply
}
