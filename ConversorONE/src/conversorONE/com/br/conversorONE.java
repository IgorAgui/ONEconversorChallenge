package conversorONE.com.br;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class conversorONE {
	public static void main(String[] args) {
		boolean converterNovoValor = true;

		while (converterNovoValor) {
			String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura", "Conversor de Distância" };

			// Exibe o menu e obtém a opção selecionada
			String escolha = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

			// Verifica qual opção foi selecionada
			if (escolha != null) {
				switch (escolha) {
				case "Conversor de Moeda":
					// Obtém o valor a ser convertido
					String valorString = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido:",
							"Conversão", JOptionPane.PLAIN_MESSAGE);

					// Validação do valor digitado
					if (valorString != null && !valorString.isEmpty()) {
						try {
							double valor = Double.parseDouble(valorString);

							// Obtém a moeda de conversão
							String[] moedas = { "Converter de Reais a Dólares                                      ",
									"Converter de Reais a Euros", "Converter de Reais a Libras Esterlinas",
									"Converter de Reais a Pesos Argentino", "Converter de Reais a Pesos Chileno",
									"Converter de Dólares a Reais", "Converter de Euros a Reais",
									"Converter de Libras Esterlinas a Reais", "Converter de Pesos Argentino a  Reais",
									"Converter de Pesos Chileno a Reais" };
							String moeda = (String) JOptionPane.showInputDialog(null, "Selecione a moeda de conversão:",
									"Conversão", JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);

							// Realiza a conversão baseado na moeda selecionada
							if (moeda != null) {
								switch (moeda) {
								case "Converter de Reais a Dólares                                      ":
									double valorConvertido = valor * 0.2049; // Conversão de Reais a Dólar
									DecimalFormat df = new DecimalFormat("#.##");
									String valorFormatado = df.format(valorConvertido);
									String valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a US$"
												+ valorFormatado + " Dólares.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a US$"
												+ valorFormatado + " Dólares.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a US$"
												+ valorFormatado + " Dólar.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a US$"
												+ valorFormatado + " Dólar.");
									}

									break;
								case "Converter de Reais a Euros":
									valorConvertido = valor * 0.1869; // Conversão de Reais a Euro
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null,
												"R$" + valorNovo + " reais equivalem a €" + valorFormatado + " Euros.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null,
												"R$" + valorNovo + " real equivalem a €" + valorFormatado + " Euros.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null,
												"R$" + valorNovo + " reais equivalem a €" + valorFormatado + " Euro.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null,
												"R$" + valorNovo + " real equivalem a €" + valorFormatado + " Euro.");
									}

									break;

								case "Converter de Reais a Libras Esterlinas":
									valorConvertido = valor * 0.1596; // Conversão de Reais a Libras Esterlinas
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a £"
												+ valorFormatado + " Libras Esterlinas.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a £"
												+ valorFormatado + " Libras Esterlinas.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a £"
												+ valorFormatado + " Libra Esterlina.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a £"
												+ valorFormatado + " Libra Esterlina.");
									}

									break;

								case "Converter de Reais a Pesos Argentino":
									valorConvertido = valor * 53.4759; // Conversão de Reais a Peso argentino
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a AR$"
												+ valorFormatado + " Pesos Argentino.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a AR$"
												+ valorFormatado + " Pesos Argentino.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a AR$"
												+ valorFormatado + " Peso Argentino.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a AR$"
												+ valorFormatado + " Peso Argentino.");
									}

									break;

								case "Converter de Reais a Pesos Chileno":
									valorConvertido = valor * 165.5355; // Conversão de Reais a Peso Chileno
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a CLP$"
												+ valorFormatado + " Pesos Chileno.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a CLP$"
												+ valorFormatado + " Pesos Chileno.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " reais equivalem a CLP$"
												+ valorFormatado + " Peso Chileno.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "R$" + valorNovo + " real equivalem a CLP$"
												+ valorFormatado + " Peso Chileno.");
									}

									break;

								case "Converter de Dólares a Reais":
									valorConvertido = valor * 4.8793; // Conversão de Dólar a Reais
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "US$" + valorNovo
												+ " Dólares equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "US$" + valorNovo + " Dólar equivalem a R$"
												+ valorFormatado + " Reais.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "US$" + valorNovo
												+ " Dólares equivalem a R$" + valorFormatado + " Real.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "US$" + valorNovo + " Dólar equivalem a R$"
												+ valorFormatado + " Real.");
									}
									break;

								case "Converter de Euros a Reais":
									valorConvertido = valor * 5.3482; // Conversão de Euro a Reais
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null,
												"€" + valorNovo + " Euros equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null,
												"€" + valorNovo + " Euro equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null,
												"€" + valorNovo + " Euros equivalem a R$" + valorFormatado + " Real.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null,
												"€" + valorNovo + " Euro equivalem a R$" + valorFormatado + " Real.");
									}
									break;

								case "Converter de Libras Esterlinas a Reais":
									valorConvertido = valor * 6.264; // Conversão de Libras Esterlinas a Reais
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "£" + valorNovo
												+ " Libras Esterlinas equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "£" + valorNovo
												+ " Libra Esterlina equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "£" + valorNovo
												+ " Libras Esterlinas equivalem a R$" + valorFormatado + " Real.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "£" + valorNovo
												+ " Libra Esterlina equivalem a R$" + valorFormatado + " Real.");
									}
									break;

								case "Converter de Pesos Argentino a  Reais":
									valorConvertido = valor * 0.0187; // Conversão de Peso argentino a Reais
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "AR$" + valorNovo
												+ " Pesos Argentino equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "AR$" + valorNovo
												+ " Peso Argentino equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "AR$" + valorNovo
												+ " Pesos Argentino equivalem a R$" + valorFormatado + " Real.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "AR$" + valorNovo
												+ " Peso Argentino equivalem a R$" + valorFormatado + " Real.");
									}
									break;

								case "Converter de Pesos Chileno a Reais":
									valorConvertido = valor * 0.006; // Conversão de Peso Chileno a Reais
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									if (valorConvertido > 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "CLP$" + valorNovo
												+ " Pesos Chileno equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido > 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "CLP$" + valorNovo
												+ " Peso Chileno equivalem a R$" + valorFormatado + " Reais.");
									}

									if (valorConvertido <= 1.0 && valor > 1.0) {
										JOptionPane.showMessageDialog(null, "CLP$" + valorNovo
												+ " Pesos Chileno equivalem a R$" + valorFormatado + " Real.");
									}

									if (valorConvertido <= 1.0 && valor <= 1.0) {
										JOptionPane.showMessageDialog(null, "CLP$" + valorNovo
												+ " Peso Chileno equivalem a R$" + valorFormatado + " Real.");
									}
									break;

								}
							}
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,
									"Digite apenas números e separe as casas decimais com ' . ' (ponto).", "Erro",
									JOptionPane.ERROR_MESSAGE);
							break;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor não informado.", "Erro", JOptionPane.ERROR_MESSAGE);
						break;
					}

					// Pergunta se o usuário deseja converter um novo valor
					int opcao = JOptionPane.showConfirmDialog(null, "Deseja converter um novo valor?", "Novo Valor",
							JOptionPane.YES_NO_CANCEL_OPTION);
					converterNovoValor = (opcao == JOptionPane.YES_OPTION);

					if (opcao == JOptionPane.NO_OPTION) {
						// Finaliza o programa
						JOptionPane.showMessageDialog(null, "Programa Finalizado.");
						System.exit(0);
					}

					if (opcao == JOptionPane.CANCEL_OPTION) {
						// Finaliza o programa
						JOptionPane.showMessageDialog(null, "Programa Concluído.");
						System.exit(0);
					}

					break;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//
				case "Conversor de Temperatura":

					// Obtém o valor a ser convertido
					valorString = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido:", "Conversão",
							JOptionPane.PLAIN_MESSAGE);

					// Validação do valor digitado
					if (valorString != null && !valorString.isEmpty()) {
						try {
							double valor = Double.parseDouble(valorString);

							// Obtém a temperatura de conversão
							String[] temperaturas = {
									"Converter de Celsius para Fahrenheit                                      ",
									"Converter de Celsius para Kelvin", "Converter de Fahrenheit para Celsius",
									"Converter de Fahrenheit para Kelvin", "Converter de Kelvin para Celsius",
									"Converter de Kelvin para Fahrenheit" };

							String temperatura = (String) JOptionPane.showInputDialog(null,
									"Selecione a temperatura de conversão:", "Conversão", JOptionPane.PLAIN_MESSAGE,
									null, temperaturas, temperaturas[0]);

							// Realiza a conversão baseado na temperatura selecionada
							if (temperatura != null) {
								switch (temperatura) {
								case "Converter de Celsius para Fahrenheit                                      ":
									double valorConvertido = valor * 1.8 + 32;
									DecimalFormat df = new DecimalFormat("#.##");
									String valorFormatado = df.format(valorConvertido);
									String valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valorNovo + "°C Grau Celsius equivalem a "
											+ valorFormatado + "°F Grau Fahrenheit.");

									break;

								case "Converter de Celsius para Kelvin":
									valorConvertido = valor + 273.15;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valorNovo + "°C Grau Celsius equivalem a "
											+ valorFormatado + "Kelvin (K).");

									break;

								case "Converter de Fahrenheit para Celsius":
									valorConvertido = (valor - 32) * 5 / 9;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valorNovo + "°F Grau Fahrenheit equivalem a "
											+ valorFormatado + "°C Grau Celsius.");

									break;

								case "Converter de Fahrenheit para Kelvin":
									valorConvertido = (valor + 459.67) * 5 / 9;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valorNovo + "°F Grau Fahrenheit equivalem a "
											+ valorFormatado + "Kelvin (K).");

									break;

								case "Converter de Kelvin para Celsius":
									valorConvertido = valor - 273.15;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valorNovo + "Kelvin (K) equivalem a "
											+ valorFormatado + "°C Grau Celsius.");

									break;

								case "Converter de Kelvin para Fahrenheit":
									valorConvertido = (valor * 9 / 5) - 459.67;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valorNovo + "Kelvin (K) equivalem a "
											+ valorFormatado + "°F Grau Fahrenheit.");

									break;

								}
							}
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,
									"Digite apenas números e separe as casas decimais com ' . ' (ponto).", "Erro",
									JOptionPane.ERROR_MESSAGE);
							break;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor não informado.", "Erro", JOptionPane.ERROR_MESSAGE);
						break;
					}

					// Pergunta se o usuário deseja converter um novo valor
					opcao = JOptionPane.showConfirmDialog(null, "Deseja converter um novo valor?", "Novo Valor",
							JOptionPane.YES_NO_CANCEL_OPTION);
					converterNovoValor = (opcao == JOptionPane.YES_OPTION);

					if (opcao == JOptionPane.NO_OPTION) {
						// Finaliza o programa
						JOptionPane.showMessageDialog(null, "Programa Finalizado.");
						System.exit(0);
					}

					if (opcao == JOptionPane.CANCEL_OPTION) {
						// Finaliza o programa
						JOptionPane.showMessageDialog(null, "Programa Concluído.");
						System.exit(0);
					}

					break;

//----------------------------------------------------------------------------------------------------------------------------------------------------------//

				case "Conversor de Distância":

					// Obtém o valor a ser convertido
					valorString = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido:", "Conversão",
							JOptionPane.PLAIN_MESSAGE);

					// Validação do valor digitado
					if (valorString != null && !valorString.isEmpty()) {
						try {
							double valor = Double.parseDouble(valorString);

							// Obtém a Distância de conversão
							String[] Distancias = {
									"Converter de Metros para Jardas                                      ",
									"Converter de Metros para Milhas", "Converter de Metros para Quilómetros",
									"Converter de Metros para Centímetros", "Converter de Jardas para Metros",
									"Converter de Jardas para Milhas", "Converter de Jardas para Quilómetros",
									"Converter de Jardas para Centímetros", "Converter de Milhas para Metros",
									"Converter de Milhas para Jardas", "Converter de Milhas para Quilómetros",
									"Converter de Milhas para Centímetros", "Converter de Quilómetros para Metros",
									"Converter de Quilómetros para Jardas", "Converter de Quilómetros para Milhas",
									"Converter de Quilómetros para Centímetros", "Converter de Centímetros para Metros",
									"Converter de Centímetros para Jardas", "Converter de Centímetros para Milhas",
									"Converter de Centímetros para Quilómetros" };

							String Distancia = (String) JOptionPane.showInputDialog(null,
									"Selecione a Distância de conversão:", "Conversão", JOptionPane.PLAIN_MESSAGE, null,
									Distancias, Distancias[0]);

							// Realiza a conversão baseado na Distancia selecionada
							if (Distancia != null) {
								switch (Distancia) {
								case "Converter de Metros para Jardas                                      ":
									double valorConvertido = valor * 1.0936133;
									DecimalFormat df = new DecimalFormat("#.##");
									String valorFormatado = df.format(valorConvertido);
									String valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valorNovo + " m (Metro) equivalem a " + valorFormatado + " yd (Jarda).");

									break;

								case "Converter de Metros para Milhas":
									valorConvertido = valor / 1609.344;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " m (Metro) equivalem a " + valorConvertido + " mi (Milha).");

									break;

								case "Converter de Metros para Quilómetros":
									valorConvertido = valor / 1000;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " m (Metro) equivalem a " + valorConvertido + " km (Quilómetro).");

									break;

								case "Converter de Metros para Centímetros":
									valorConvertido = valor * 100;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " m (Metro) equivalem a " + valorConvertido + " cm (Centímetro).");

									break;

								case "Converter de Jardas para Metros":
									valorConvertido = valor * 0.9144;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " yd (Jarda) equivalem a " + valorConvertido + " m (Metro).");

									break;

								case "Converter de Jardas para Milhas":
									valorConvertido = valor / 1760;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " yd (Jarda) equivalem a " + valorConvertido + " mi (Milha).");

									break;

								case "Converter de Jardas para Quilómetros":
									valorConvertido = valor * 0.0009144;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " yd (Jarda) equivalem a " + valorConvertido + " km (Quilómetro).");

									break;

								case "Converter de Jardas para Centímetros":
									valorConvertido = valor * 91.44;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " yd (Jarda) equivalem a " + valorConvertido + " cm (Centímetro).");

									break;

								case "Converter de Milhas para Metros":
									valorConvertido = valor * 1609.344;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " mi (Milha) equivalem a " + valorConvertido + " m (Metro).");

									break;

								case "Converter de Milhas para Jardas":
									valorConvertido = valor * 1760;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " mi (Milha) equivalem a " + valorConvertido + " yd (Jarda).");

									break;

								case "Converter de Milhas para Quilómetros":
									valorConvertido = valor * 1.60934;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " mi (Milha) equivalem a " + valorConvertido + " km (Quilómetro).");

									break;

								case "Converter de Milhas para Centímetros":
									valorConvertido = valor * 160934.4;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " mi (Milha) equivalem a " + valorConvertido + " cm (Centímetro).");

									break;

								case "Converter de Quilómetros para Metros":
									valorConvertido = valor * 1000;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " km (Quilómetro) equivalem a " + valorConvertido + " m (Metro).");

									break;

								case "Converter de Quilómetros para Jardas":
									valorConvertido = valor * 1093.6133;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " km (Quilómetro) equivalem a " + valorConvertido + " yd (Jarda).");

									break;

								case "Converter de Quilómetros para Milhas":
									valorConvertido = valor * 1.60934;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " km (Quilómetro) equivalem a " + valorConvertido + " mi (Milha).");

									break;

								case "Converter de Quilómetros para Centímetros":
									valorConvertido = valor * 100000;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valor + " km (Quilómetro) equivalem a "
											+ valorConvertido + " cm (Centímetro).");

									break;

								case "Converter de Centímetros para Metros":
									valorConvertido = valor / 100;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " cm (Centímetro) equivalem a " + valorConvertido + " m (Metro).");

									break;

								case "Converter de Centímetros para Jardas":
									valorConvertido = valor / 91.44;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " cm (Centímetro) equivalem a " + valorConvertido + " yd (Jarda).");

									break;

								case "Converter de Centímetros para Milhas":
									valorConvertido = valor / 160934.4;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null,
											valor + " cm (Centímetro) equivalem a " + valorConvertido + " mi (Milha).");

									break;

								case "Converter de Centímetros para Quilómetros":
									valorConvertido = valor / 100000;
									df = new DecimalFormat("#.##");
									valorFormatado = df.format(valorConvertido);
									valorNovo = df.format(valor);

									JOptionPane.showMessageDialog(null, valor + " cm (Centímetro) equivalem a "
											+ valorConvertido + " km (Quilómetro).");

									break;

								}
							}
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,
									"Digite apenas números e separe as casas decimais com ' . ' (ponto).", "Erro",
									JOptionPane.ERROR_MESSAGE);
							break;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor não informado.", "Erro", JOptionPane.ERROR_MESSAGE);
						break;
					}

					// Pergunta se o usuário deseja converter um novo valor
					opcao = JOptionPane.showConfirmDialog(null, "Deseja converter um novo valor?", "Novo Valor",
							JOptionPane.YES_NO_CANCEL_OPTION);
					converterNovoValor = (opcao == JOptionPane.YES_OPTION);

					if (opcao == JOptionPane.NO_OPTION) {
						// Finaliza o programa
						JOptionPane.showMessageDialog(null, "Programa Finalizado.");
						System.exit(0);
					}

					if (opcao == JOptionPane.CANCEL_OPTION) {
						// Finaliza o programa
						JOptionPane.showMessageDialog(null, "Programa Concluído.");
						System.exit(0);
					}

					break;

//----------------------------------------------------------------------------------------------------------------------------------------------------------//

				}
			} else {
				// Exibe a mensagem de confirmação para cancelar a execução
				int confirmacao = JOptionPane.showConfirmDialog(null, "Você realmente deseja cancelar a execução?",
						"Confirmação", JOptionPane.YES_NO_OPTION);

				if (confirmacao == JOptionPane.YES_OPTION) {
					// Finaliza o programa
					JOptionPane.showMessageDialog(null, "Programa Finalizado.");
					System.exit(0);
				}
				if (confirmacao == JOptionPane.NO_OPTION) {
					// Volta o Main
				}

			}

		}

	}
}
