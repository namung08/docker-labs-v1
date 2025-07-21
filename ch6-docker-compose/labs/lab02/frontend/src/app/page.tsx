"use client";

import { useState, useEffect } from "react";

export default function Home() {
  const [lang, setLang] = useState("kr");
  const [greeting, setGreeting] = useState("");

  useEffect(() => {
    fetch(`${process.env.NEXT_PUBLIC_API_URL}/greeting?lang=${lang}`)
      .then((res) => res.text())
      .then(setGreeting)
      .catch(() => setGreeting("API 오류"));
  }, [lang]);

  return (
    <main style={{ padding: 40 }}>
      <h1>Hello World</h1>
      <select value={lang} onChange={(e) => setLang(e.target.value)}>
        <option value="kr">한국어</option>
        <option value="en">English</option>
        <option value="jp">日本語</option>
      </select>
      <div style={{ marginTop: 24, fontSize: 32 }}>{greeting}</div>
    </main>
  );
}
