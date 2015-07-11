package Test

import java.util.Date

import akka.actor.Actor
import org.apache.mesos.Protos.Offer

/**
 * Created by root on 15-7-11.
 * Project: ${Project_name}.
 *
 * Just for Matrix.
 */
class Auctioin(seller: Actor, minBid: Int, closing: Date) {
  val timeToShutdown = 36000000
  val bidIncreament = 10
  def act(): Unit ={
    var maxBid = minBid - bidIncreament
    var maxBidder: Actor = null
    var running = true
    while (running){
      //receiveWithIn((closing.getTime() - new Date().getTime())){
        //case Offer(bid, client) =>
      }
    }
  }
  new Date().getTime()

}
