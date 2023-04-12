const API_KEY = "58ebc43d0f5b149df0f154cd9dd0ba78";
const PIXABAY_KEY = "34735911-7d85964b90bff37d61ffde2cc";
const city_input = document.querySelector("#city_input");
const form = document.forms.search;
//const submitBtn = document.querySelector("#submit");

// elementos de resultado da consulta
const result_area = document.querySelector(".result-area");
const container = document.querySelector(".container")
const input_container = document.querySelector(".input-container")
const body = document.body;

const get_weather_data = async(city) => {
  try {
    const weather_report_url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&units=metric&lang=pt_BR&appid=${API_KEY}`;

    const res = await fetch(weather_report_url);
    if (!res.ok){
      if(res.status != 404) throw new Error(`HTTP error! Status: ${res.status}`);
      return [];
    }

    const data = await res.json();
    return data;
  }
  
  catch (error) {
    console.error('Error:', error);
  }
};

const get_background_image = async (city_name) => {
  try {
    const pixabay_url = `https://pixabay.com/api/?key=${PIXABAY_KEY}&q=${city_name}%20city&orientation=horizontal&per_page=5&image_type=photo`;

    const res = await fetch(pixabay_url);    
    if (!res.ok) throw new Error(`HTTP error! Status: ${res.status}`);

    const data = await res.json();
    const numero_aleatorio = Math.floor(Math.random() * data.hits.length);

    return (
      data.total
      ? data.hits[numero_aleatorio].largeImageURL ?? data.hits[numero_aleatorio].imageURL
      : null
    );
  }
  
  catch (error) {
    console.error('Error:', error);
  }
};

const show_weather_data = async (city) => {
    const data = await get_weather_data(city);

    if(data.length == 0){
      alert("Cidade não encontrada :(\nDigite uma cidade válida :)")
      return
    }
    
    // nome_cidade.innerText = city_input.value;
    let nome_cidade = data.name;
    let bandeira_pais = `https://flagsapi.com/${data.sys.country}/flat/32.png`;
    let icone_descricao = `https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png`;
    let descricao = data.weather[0].description;
    let temperatura_atual = `${data.main.temp}º`;
    let sensacao_termica = `${data.main.feels_like}º`;
    let temperatura_minima = `${data.main.temp_min}º`;
    let temperatura_maxima = `${data.main.temp_max}º`;
    let umidade = `${data.main.humidity}%`;
    let vento = `${data.wind.speed} km/h`;
    let nascer_sol = new Date(data.sys.sunrise * 1000).toLocaleTimeString();
    let por_sol = new Date(data.sys.sunset * 1000).toLocaleTimeString();

    arrumarVisualizacao()
    result_area.innerHTML = 
    `<table> \
      <tr title="País e nome da cidade"> \
          <td><img src="${bandeira_pais}" alt="" id="bandeira-pais"></td> \
          <td><span id="nome-cidade">${nome_cidade}</span></td> \
      </tr> \
      <tr title="Temperatura atual"> \
          <td><i class="fa-solid fa-temperature-half"></i></td> \
          <td><span id="temperatura-atual">${temperatura_atual}</span></td> \
      </tr> \
      <tr title="Temperatura mínima"> \
          <td><i class="fa-solid fa-temperature-empty" id="ico-temp-min"></i></td> \
          <td><span id="temperatura-minima">${temperatura_minima}</span></td> \
      </tr> \
      <tr title="Umidade do ar"> \
          <td><i class="fa-solid fa-water" id="ico-umidade"></i></td> \
          <td><span id="umidade">${umidade}</span></td> \
      </tr> \
      <tr title="Nascer do sol (horário local)"> \
          <td><i class="fa-solid fa-sun" id="ico-nascer-sol"></i></td> \
          <td><span id="nascer-sol">${nascer_sol}</span></td> \
      </tr> \
    </table> \
    <table> \
      <tr title="Descrição do tempo"> \
          <td><img src="${icone_descricao}" alt="" id="ico-descricao"></td> \
          <td><span id="descricao">${descricao}</span></td> \
      </tr> \
      <tr title="Sensação térmica"> \
          <td><i class="fa-solid fa-sun-plant-wilt"></i></td> \
          <td><span id="sensacao-termica">${sensacao_termica}</span></td> \
      </tr> \
      <tr title="Temperatura máxima"> \
          <td><i class="fa-solid fa-temperature-full" id="ico-temp-max"></i></td> \
          <td><span id="temperatura-maxima">${temperatura_maxima}</span></td> \
      </tr> \
      <tr title="Velocidade do vento"> \
          <td><i class="fa-solid fa-wind"></i></td> \
          <td><span id="vento">${vento}</span></td> \
      </tr> \
      <tr title="Por do sol (horário local)"> \
          <td><i class="fa-solid fa-moon" id="ico-por-sol"></i></td> \
          <td><span id="por-sol">${por_sol}</span></td> \
      </tr> \
    </table>`
    

    try {
      const novo_bg = await get_background_image(data.name)
      body.style.backgroundImage = novo_bg ? `url(${novo_bg})` : limparImagemFundo();
    }
    catch (error) {
      console.error('Error:', error);
    }
};

function arrumarVisualizacao(){
  container.style.alignSelf = "";
  container.style.height = "100%";
  container.style.width = "100%";
  container.style.display = "block";
  container.style.justifyContent = "";

  input_container.style.alignSelf = "center";
  input_container.style.justifyContent = "";

  result_area.style.display = "grid";
}

function limparImagemFundo(){
  body.style.backgroundImage = "none";
  body.style.background = "linear-gradient(to bottom, #4257f5, #429bf5)";
}

// submitBtn.addEventListener("click", async (e) => {
form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const city = city_input.value;

  show_weather_data(city);
});

/*city_input.addEventListener("keyup", (e) => {
  if (e.keyCode === 13) {
    const city = e.target.value;

    show_weather_data(city);
  }
});*/
