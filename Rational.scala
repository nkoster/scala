class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  // auxiliary constructor
  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  def + (r: Rational): Rational = {
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
  }

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def * (r: Rational): Rational =
    new Rational(numer * r.numer, denom * r.denom)

  def lessThan(r: Rational) = {
    // this.numer * r.denom < r.numer * this.denom
    numer * r.denom < r.numer * denom
  }

  def max(r: Rational): Rational =
    // if (this.lessThan(r)) r else this
    if (lessThan(r)) r else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

}
