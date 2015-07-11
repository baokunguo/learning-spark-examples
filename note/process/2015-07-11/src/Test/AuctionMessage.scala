package Test

import akka.actor.Actor

/**
 * Created by root on 15-7-11.
 */
abstract class AuctionMessage {

  case class Offer(bid:Int, client:Actor)
      extends AuctionMessage

  case class Inquire(client:Actor) extends AuctionMessage

}
