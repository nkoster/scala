class Rational(n: Int, d: Int) {

  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  // auxiliary constructor
  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  def add(r: Rational): Rational = {
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
  }

  def lessThan(r: Rational) = {
    // this.numer * r.denom < r.numer * this.denom
    numer * r.denom < r.numer * denom
  }

  def max(r: Rational): Rational =
    // if (this.lessThan(r)) r else this
    if (lessThan(r)) r else this

}
