function getDay(day) {
  const days = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes','Sábado', 'Domingo']
  return "Hoy es: " + days.filter((_, index) => day - 1 === index)[0]
}

console.log(
  getDay(7)
)